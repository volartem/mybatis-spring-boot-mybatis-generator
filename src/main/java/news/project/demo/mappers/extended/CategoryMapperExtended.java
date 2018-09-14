package news.project.demo.mappers.extended;

import news.project.demo.mappers.CategoryMapper;
import news.project.demo.models.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CategoryMapperExtended extends CategoryMapper {
    List<Category> selectAllCategories();
}
