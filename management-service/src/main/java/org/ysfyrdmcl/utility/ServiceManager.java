package org.ysfyrdmcl.utility;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class ServiceManager <T,ID> implements IService<T,ID>{
    private final MongoRepository<T,ID> service;


    public ServiceManager(MongoRepository<T, ID> service) {
        this.service = service;
    }

    @Override
    public T save(T entity) {
        return service.save(entity);
    }


    @Override
    public T update(T entity) {

        return service.save(entity);
    }

    @Override
    public void deleteById(ID id) {
       service.deleteById(id);
    }

    @Override
    public T findById(ID id) {
        return service.findById(id).get();
    }

    @Override
    public List<T> findAll() {
        return service.findAll();
    }
}
