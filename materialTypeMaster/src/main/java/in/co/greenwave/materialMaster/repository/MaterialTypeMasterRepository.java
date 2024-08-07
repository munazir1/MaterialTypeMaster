package in.co.greenwave.materialMaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.co.greenwave.materialMaster.entity.MaterialTypeMaster;


@Repository
public interface MaterialTypeMasterRepository  extends JpaRepository<MaterialTypeMaster,Long>{

	
	@Query(value="SELECT  distinct material_name  FROM [Filter_PI].[dbo].[material_type_master] where  active=1", nativeQuery = true)
	public List<MaterialTypeMaster> getMaterialname( ) ;	
}
