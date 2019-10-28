package com.co.cbg.springboot.app.productos.service;

import java.util.List;

import com.co.cbg.springboot.app.productos.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
}
