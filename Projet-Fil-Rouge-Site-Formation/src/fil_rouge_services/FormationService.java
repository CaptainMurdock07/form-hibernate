package fil_rouge_services;

import java.util.List;

import fil_rouge_package.Produit;

@Service
public class FormationService {

	@Autowired
	private FormationRepository formationRepository;
	
	@Override
	public List<Produit> findAll() {
		
	}
}
