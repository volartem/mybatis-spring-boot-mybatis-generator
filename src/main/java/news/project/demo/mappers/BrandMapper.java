package news.project.demo.mappers;

import java.util.List;
import news.project.demo.models.Brand;
import news.project.demo.models.BrandCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BrandMapper {
    long countByExample(BrandCriteria example);

    int deleteByExample(BrandCriteria example);

    int deleteByPrimaryKey(int id);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExampleWithRowbounds(BrandCriteria example, RowBounds rowBounds);

    List<Brand> selectByExample(BrandCriteria example);

    Brand selectByPrimaryKey(int id);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandCriteria example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandCriteria example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}