package com.friendship.songr.infrastructure;

import com.friendship.songr.domain.AlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface AlbumRepository extends JpaRepository<AlbumModel,Long> {

}
