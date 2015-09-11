package td.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import td.dao.TravelDao;
import td.service.TravelService;
import td.vo.Travel;

@Service
public class TravelServiceImpl implements TravelService {
  @Autowired TravelDao travelDao;
  
  @Override
  public List<Travel> list() {
    
    return travelDao.list();
  }

  @Override
  public int delete(int no) {
    return travelDao.delete(no);
  }

  @Override
  public int update(Travel travel) {
    return travelDao.update(travel);
  }

  @Override
  public int insert(Travel travel) {
    return travelDao.insert(travel);
  }

  @Override
  public Travel get(int no) {
    return travelDao.get(no);
  }

  @Override
  public int countAll() {
    return travelDao.countAll();
  }
}






