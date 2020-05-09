package com.cts.cba.dashboard.repository;

import java.util.List;

import com.cts.cba.dashboard.entity.Dashboard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepo extends JpaRepository<Product, Integer> {

}