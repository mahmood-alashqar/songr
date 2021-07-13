package com.friendship.songr.infrastructure;

import com.friendship.songr.domain.SongModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<SongModel,Long> {

}
