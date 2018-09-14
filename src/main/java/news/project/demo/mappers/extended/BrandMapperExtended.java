package news.project.demo.mappers.extended;

import news.project.demo.mappers.BrandMapper;
import news.project.demo.models.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BrandMapperExtended extends BrandMapper {
    List<Brand> selectAllBrands();
}
