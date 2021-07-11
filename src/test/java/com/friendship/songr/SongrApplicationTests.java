package com.friendship.songr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
@Test
	void getTitleTest(){
		Album testAlbum = new Album("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
	Assertions.assertEquals("light",testAlbum.getTitle());

}
@Test
void getArtistTest(){
	Album testAlbum = new Album("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
	Assertions.assertEquals("madeson",testAlbum.getArtist());

}
	@Test
	void getSongCountTest(){
		Album testAlbum = new Album("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
		Assertions.assertEquals(19,testAlbum.getSongCount());

	}
	@Test
	void getLengthTest(){
		Album testAlbum = new Album("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
		Assertions.assertEquals("5:18",testAlbum.getLength());
	}
	@Test
	void getImageUrlTest(){
		Album testAlbum = new Album("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
		Assertions.assertNotNull(testAlbum.getImageUrl());
	}
}
