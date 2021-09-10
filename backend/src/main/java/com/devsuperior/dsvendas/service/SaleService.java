/**
 * 
 */
package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSucessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

/**
 * @author Marcus Dimitri
 *
 */

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sRepo;

	@Transactional(readOnly = true) // Evitar lock no banco
	public Page<SaleDTO> findAll(Pageable pageable) {
		sRepo.findAll(); // para não fazer dupla pesquisa de venddores.
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));

	}

	@Transactional(readOnly = true) // Evitar lock no banco
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();

	}
	
	@Transactional(readOnly = true) // Evitar lock no banco
	public List<SaleSucessDTO> sucessGroupedBySeller() {
		return repository.sucessGroupedBySeller();

	}

}
