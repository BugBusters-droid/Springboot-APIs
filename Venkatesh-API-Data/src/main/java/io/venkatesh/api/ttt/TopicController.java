package io.venkatesh.api.ttt;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired 
	TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> gettopicdetail(){
		return topicService.getDetail();
	}
	
	
	@GetMapping("/topics/{id}")
	public Topic getSpecficTopic(@PathVariable String id)
	{
		return topicService.getParticularEmployeeDetail(id);
	}
	
	
	
	@PostMapping("/topic")
	public void createTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topic/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
		topicService.updateTopic(topic);
	}
	
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	

}
