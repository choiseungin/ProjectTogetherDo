package td.dao;

import java.util.List;
import java.util.Map;

import td.vo.Travel;

public interface TravelDao {
  List<Travel> list();
  int delete(int no);
  int update(Travel travel);
  int insert(Travel travel);
  Travel get(int no);
  int countAll();
}











