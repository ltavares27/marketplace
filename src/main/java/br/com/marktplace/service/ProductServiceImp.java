package br.com.marktplace.service;

import br.com.marktplace.domain.dto.ProductDto;
import br.com.marktplace.domain.entity.Product;
import br.com.marktplace.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp {

    private final ProductRepository productRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.modelMapper = new ModelMapper();
    }

    public ProductDto save(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        return modelMapper.map(productRepository.save(product), ProductDto.class);
    }
}
