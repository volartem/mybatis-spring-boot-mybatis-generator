package news.project.demo.mappers;

import news.project.demo.models.Catalog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CatalogMapper {

    List<Catalog> selectAllCatalogs();
}
