package news.project.demo.mappers.extended;

import news.project.demo.mappers.BrandMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BrandMapperExtended extends BrandMapper {
}
