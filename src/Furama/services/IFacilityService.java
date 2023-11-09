package Furama.services;

import Furama.models.Facility;

import java.util.Map;

public interface IFacilityService {
    Map<Facility,Integer> getList();
    void add(Facility facility);
    Map<Facility,Integer> showMaintenanceList();
    void delete(int id);
}
