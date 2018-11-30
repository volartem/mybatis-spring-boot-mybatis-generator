package news.project.demo.mappers.extended;

import news.project.demo.mappers.CatalogMapper;
import news.project.demo.models.Catalog;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface CatalogMapperExtended extends CatalogMapper {

    List<Catalog> selectAllCatalogs();
}
