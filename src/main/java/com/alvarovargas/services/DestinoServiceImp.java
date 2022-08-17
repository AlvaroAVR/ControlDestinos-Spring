package com.alvarovargas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alvarovargas.model.Destino;
import com.alvarovargas.repository.DestinoRepository;

@Service
public class DestinoServiceImp implements DestinoService {

	@Autowired
	private DestinoRepository destinoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Destino> findAll() {
		return destinoRepository.findAll();
	}

	@Override
	@Transactional
	public void save(Destino destino) {
		destinoRepository.save(destino);
	}

	@Override
	@Transactional
	public void update(Destino destino) {
		destinoRepository.save(destino);
	}

	@Override
	@Transactional
	public void delete(Destino destino) {
		destinoRepository.delete(destino);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Destino> findById(Long id) {
		return destinoRepository.findById(id);
	}

}
