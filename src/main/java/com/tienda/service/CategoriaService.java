package com.tienda.service;

import com.tienda.domain.Categoria; 
import java.util.List; 

public interface CategoriaService {
    //asigna el metodo para despues implementarlo en el serviceImpl (Read)
    public List<Categoria> getCategorias(boolean activos);
}
 