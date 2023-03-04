package uz.najot.gardengame.mapper;

import org.springframework.stereotype.Component;
import uz.najot.gardengame.dto.ProductDto;
import uz.najot.gardengame.model.Product;

import java.util.List;
import java.util.Set;

@Component
public class ProductMapper implements EntityMapper<ProductDto, Product>{
    @Override
    public Product toEntity(ProductDto dto) {
        return new Product(dto.getName(), dto.getPrice(), dto.getRipingTime(), dto.getSellTime());
    }

    @Override
    public ProductDto toDto(Product entity) {
        return null;
    }

    @Override
    public List<Product> toEntity(List<ProductDto> dtoList) {
        return null;
    }

    @Override
    public List<ProductDto> toDto(List<Product> entityList) {
        return null;
    }

    @Override
    public Set<ProductDto> toDto(Set<Product> entityList) {
        return null;
    }
}
