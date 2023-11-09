package Furama.repositories;

import Furama.models.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility,Integer> getList();
    void add(Facility facility);
    Map<Facility,Integer> showMaintenanceList();
    void delete(int id);
}
