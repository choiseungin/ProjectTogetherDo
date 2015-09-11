package td.service;

import java.util.List;

import td.vo.Travel;

public interface TravelService {
  List<Travel> list();
  int delete(int no);
  int update(Travel travel);
  int insert(Travel travel);
  Travel get(int no);
  int countAll();
}







