package com.example.expensetracker.repository

import com.example.expensetracker.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository extends JpaRepository<Category, Long> {}
