package com.ricardoburitibelem.catalogcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoburitibelem.catalogcliente.entity.Client;



public interface ClientRepository extends JpaRepository<Client, Long>{

}
