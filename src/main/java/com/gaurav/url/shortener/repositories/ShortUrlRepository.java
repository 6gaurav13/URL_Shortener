package com.gaurav.url.shortener.repositories;

import com.gaurav.url.shortener.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    @Query("Select s  from ShortUrl s where s.isPrivate=false order by s.createdAt desc")
    List<ShortUrl> findPublicShortUrls();
}
