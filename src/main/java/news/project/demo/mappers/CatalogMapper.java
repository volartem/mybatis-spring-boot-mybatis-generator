package news.project.demo.mappers;

import java.util.List;
import news.project.demo.models.Catalog;
import news.project.demo.models.CatalogCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CatalogMapper {
    long countByExample(CatalogCriteria example);

    int deleteByExample(CatalogCriteria example);

    int deleteByPrimaryKey(int id);

    int insert(Catalog record);

    int insertSelective(Catalog record);

    List<Catalog> selectByExampleWithRowbounds(CatalogCriteria example, RowBounds rowBounds);

    List<Catalog> selectByExample(CatalogCriteria example);

    Catalog selectByPrimaryKey(int id);

    int updateByExampleSelective(@Param("record") Catalog record, @Param("example") CatalogCriteria example);

    int updateByExample(@Param("record") Catalog record, @Param("example") CatalogCriteria example);

    int updateByPrimaryKeySelective(Catalog record);

    int updateByPrimaryKey(Catalog record);
}