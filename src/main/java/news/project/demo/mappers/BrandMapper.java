package news.project.demo.mappers;

import news.project.demo.models.Brand;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BrandMapper {

    List<Brand> selectAllBrands();
}
