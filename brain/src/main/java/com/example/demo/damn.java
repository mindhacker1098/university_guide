package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@CrossOrigin(maxAge=3600)
@RestController
public class damn {
	@Autowired
	info in;
	@Autowired
	sinfo sin;

@PostMapping("/file")
public void damn(String name,String date,MultipartFile file,String desp,String plac) throws IOException {
	
	data d=new data();
	d.setName(name);
	d.setDate(date);
	d.setData(file.getBytes());
	d.setDesp(desp);
	d.setPlac(plac);
	
	in.save(d);
}
	

@RequestMapping("/img")
public List<data> damn1() {
	
	
	

	
	
	
	return in.findByOrderByDate();
}

@RequestMapping("/damn")
public List<data> ggg(String date){
	
	
	
	
	return in.findByDateGreaterThanOrderByDate(date);
}

@RequestMapping("/songs")
public List<song> sa(){
	
	return sin.findByOrderById();
}
@PostMapping("/song")
public void san(MultipartFile file) throws IOException {song s=new song();
s.setData(file.getBytes());
sin.save(s);
}


}
