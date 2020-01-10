package repository;

import java.util.List;

public interface IGenericRepository {

     void create(Object object);
     List<Object> findAll();
     Object find (Long objectId);
     void edit (Object object);
     void delete ();

}
