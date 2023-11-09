package Furama.repositories.impl;

import Furama.models.Facility;
import Furama.models.House;
import Furama.models.Room;
import Furama.models.Villa;
import Furama.repositories.IFacilityRepository;
import Furama.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private final String FILE = "src/Furama/data/FacilityData.csv";
    private final String COMMA = ",";

    @Override
    public Map<Facility, Integer> getList() {
        List<String> stringList = ReadAndWrite.readFile(FILE);
        Map<Facility, Integer> facilityIntegerMap = convertToE(stringList);
        return facilityIntegerMap;
    }

    private Map<Facility, Integer> convertToE(List<String> stringList) {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        String[] line;
        String[] data1;
        for (String str : stringList) {
            line = str.split(",");
            data1 = line[1].split("-");
            if (data1[0].equals("SVVL")) {
                facilityIntegerMap.put(new Villa(Integer.parseInt(line[0]), line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), line[6], line[7], Integer.parseInt(line[8]), Integer.parseInt(line[9])), Integer.parseInt(line[10]));
            } else if (data1[0].equals("SVHO")) {
                facilityIntegerMap.put(new House(Integer.parseInt(line[0]), line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), line[6], line[7], Integer.parseInt(line[8])), Integer.parseInt(line[9]));
            } else {
                facilityIntegerMap.put(new Room(Integer.parseInt(line[0]), line[1], line[2], Integer.parseInt(line[3]), Integer.parseInt(line[4]), Integer.parseInt(line[5]), line[6], line[7]), Integer.parseInt(line[8]));
            }
        }
        return facilityIntegerMap;
    }

    @Override
    public void add(Facility facility) {
        Map<Facility,Integer>facilityIntegerMap = new LinkedHashMap<>();
        facilityIntegerMap.put(facility,0);
        ReadAndWrite.writeFile(FILE, covertToString(facilityIntegerMap),true);
    }

    @Override
    public Map<Facility, Integer> showMaintenanceList() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
    public List<String> covertToString(Map<Facility, Integer> e) {
        List<String> strings = new ArrayList<>();
        e.forEach((Facility facility, Integer id) -> {
            if (facility instanceof House) {
                strings.add(facility.getId() + COMMA +
                        facility.getCode() + COMMA +
                        facility.getName() + COMMA +
                        facility.getArea() + COMMA +
                        facility.getPrice() + COMMA +
                        facility.getPeople() + COMMA +
                        facility.getType() + COMMA +
                        ((House) facility).getStandard() + COMMA +
                        ((House) facility).getFloor() + COMMA + id);
            } else if (facility instanceof Villa) {
                strings.add(facility.getId() + COMMA +
                        facility.getCode() + COMMA +
                        facility.getName() + COMMA +
                        facility.getArea() + COMMA +
                        facility.getPrice() + COMMA +
                        facility.getPeople() + COMMA +
                        facility.getType() + COMMA +
                        ((Villa) facility).getStandard() + COMMA +
                        ((Villa) facility).getAreaPool() + COMMA +
                        ((Villa) facility).getFloor() + COMMA +
                        id);
            } else {
                strings.add(facility.getId() + COMMA +
                        facility.getCode() +COMMA +
                        facility.getName() + COMMA +
                        facility.getArea() + COMMA +
                        facility.getPrice() + COMMA +
                        facility.getPeople() + COMMA +
                        facility.getType() + COMMA +
                        ((Room) facility).getFree() + COMMA +
                        id);
            }
        });
        return strings;
    }
}
