package com.sggsiet.farmerportal.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sggsiet.farmerportal.entity.Admin;
import com.sggsiet.farmerportal.entity.AskQuestions;
import com.sggsiet.farmerportal.entity.Customer;
import com.sggsiet.farmerportal.entity.Experts;
import com.sggsiet.farmerportal.entity.Farmer;
import com.sggsiet.farmerportal.entity.Product;
import com.sggsiet.farmerportal.repository.AdminRepository;
import com.sggsiet.farmerportal.repository.AskQuestionRepository;
import com.sggsiet.farmerportal.repository.CustomerRepository;
import com.sggsiet.farmerportal.repository.ExpertRepository;
import com.sggsiet.farmerportal.repository.ExpertsRepository;
import com.sggsiet.farmerportal.repository.FarmerRepository;
import com.sggsiet.farmerportal.repository.ProductRepository;
import com.sggsiet.farmerportal.service.MainService;



@Service
public class MainServiceImplementation implements MainService{
	@Autowired
	private FarmerRepository FarmerRepository;
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ExpertsRepository expertsRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private AskQuestionRepository askQuestionRepository;
	
	@Autowired
	private ExpertRepository expertRepository;
	
	

	@Override
	public void saveFarmer(Farmer farmer) {
		FarmerRepository.save(farmer);
		
	}

	@Override
	public void saveProduct(Product product) {
		
		
	}

	@Override
	public Admin getAdminData() {
		
		String admin="admin";
		return adminRepository.findByUsername(admin);
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		customerRepository.save(customer);
	}

	@Override
	public void saveExpert(Experts expert) {
		
		expertsRepository.save(expert);
	}

	@Override
	public List<Farmer> getAllFarmers() {
		
		return FarmerRepository.findAll();
	}

	@Override
	public List<Customer> getCustomer() {
		
		return customerRepository.findAll();
	}

	@Override
	public void saveQuestion(AskQuestions askQuestions) {
		askQuestionRepository.save(askQuestions);
		
	}

	@Override
	public List<AskQuestions> getAllQuestions() {
		
		return askQuestionRepository.findAll();
	}

	@Override
	public List<Experts> getAllExpert() {
		
		return expertRepository.findAll();
	}

	@Override
	public List<Farmer> getAllFarmer() {
		
		return FarmerRepository.findAll();
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public AskQuestions getQuestion(String farmerName) {
		return askQuestionRepository.findByFarmerName(farmerName);
	}

	@Override
	public List<AskQuestions> getMyQuestions(String farmername) {
		
		return askQuestionRepository.findAllByfarmerName(farmername);
	}

	

}
