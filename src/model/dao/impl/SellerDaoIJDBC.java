package model.dao.impl;

import model.dao.SellerDao;
import model.entities.Seller;

import java.util.List;

public class SellerDaoIJDBC implements SellerDao {
    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller finById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
