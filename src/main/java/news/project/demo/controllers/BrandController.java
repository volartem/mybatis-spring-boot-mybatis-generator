package news.project.demo.controllers;


import news.project.demo.mappers.extended.BrandMapperExtended;
import news.project.demo.mappers.extended.CatalogMapperExtended;
import news.project.demo.models.Brand;
import news.project.demo.models.Catalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class BrandController {

    @Autowired
    private BrandMapperExtended brandMapper;

    @Autowired
    private CatalogMapperExtended catalogMapper;

    private static final Logger logger = LoggerFactory.getLogger(BrandController.class);

    @RequestMapping(value = "/api/brands", method = GET)
    public ResponseEntity<Object> getBrands() {
        List<Brand> brands = new ArrayList<>();
        List<Catalog> catalogs = new ArrayList<>();
        try {
            brands = brandMapper.selectAllBrands();
            catalogs = catalogMapper.selectAllCatalogs();
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        HashMap<String, Integer> result = new HashMap<>();
        result.put("brands", brands.size());
        result.put("catalogs", catalogs.size());
        return ResponseEntity.ok(result);
    }

}