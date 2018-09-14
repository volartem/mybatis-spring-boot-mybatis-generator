package news.project.demo.mappers.extended;

import news.project.demo.mappers.CatalogMapper;
import news.project.demo.models.Catalog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CatalogMapperExtended extends CatalogMapper {

    List<Catalog> selectAllCatalogs();
}
