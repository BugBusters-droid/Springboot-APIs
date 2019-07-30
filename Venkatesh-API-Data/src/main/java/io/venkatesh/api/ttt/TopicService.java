package io.venkatesh.api.ttt;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	Topicrepository  topicrepository;
	
	
	
	public List<Topic> getDetail()
	{
		return topicrepository.findAll();
	}
	
    public Topic getParticularEmployeeDetail(String id) 
    {
		
		return topicrepository.findOne(id);
	}

    public void addTopic( Topic t1) 
    {
	topicrepository.save(t1);
    }
	
	public void updateTopic(Topic id)
	{
		topicrepository.save(id);
	}
	

	public void deleteTopic(String id) 
	{
		topicrepository.delete(id);
		System.out.println("Empoloyee deleted");		
	}

	
}
