package com.enviro.assessment.inter001.sthembisobuthelezi.repository;

import com.enviro.assessment.inter001.sthembisobuthelezi.model.RecyclingBinLocations;
import com.enviro.assessment.inter001.sthembisobuthelezi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecyclingBinLocationsRepository extends JpaRepository<RecyclingBinLocations, String> {
}
