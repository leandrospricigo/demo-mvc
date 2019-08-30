package com.example.demo.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao  {

}
