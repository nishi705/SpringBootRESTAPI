//package com.springrest.springrest.Dao;
//
//import com.springrest.springrest.Entity.Course;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//@Component
//public class courseImlpl implements CourseDao{
//
//
//   @Autowired
//  public CourseDao courseDao;
//   public List<Course> list;
//
//    @Override
//    public List<Course> findAll() {
//        return list;
//    }
//
//    @Override
//    public List<Course> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Course> findAll(Pageable pageable) {
//        return null;
//    }
//
//
//    @Override
//    public List<Course> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public <S extends Course> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Course> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Course> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Course> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Course> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Course getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Course getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Course getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Course> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Course> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Course> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Course> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Course> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Course> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Course, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Course entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Course> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public Course save(Course course) {
//        return course;
//    }
//
//
//
//}
