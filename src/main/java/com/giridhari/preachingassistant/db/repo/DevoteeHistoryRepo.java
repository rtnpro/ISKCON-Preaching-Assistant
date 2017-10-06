package com.giridhari.preachingassistant.db.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.giridhari.preachingassistant.db.model.DevoteeHistory;
import com.giridhari.preachingassistant.db.model.Devotee;

@Repository
public interface DevoteeHistoryRepo extends CrudRepository<DevoteeHistory, Long> {
	
	public List<DevoteeHistory> findByCommentedByDevotee_id(long id);
	
	public List<DevoteeHistory> findByCommentedByDevotee(Devotee commentedByDevotee);
	
	public List<DevoteeHistory> findByRatedDevotee_id(long id);
	
	public List<DevoteeHistory> findByRatedDevotee(Devotee ratedDevotee);
}
