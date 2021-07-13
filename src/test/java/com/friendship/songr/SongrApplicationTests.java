package com.friendship.songr;

import com.friendship.songr.domain.AlbumModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
@Test
	void getTitleTest(){
		AlbumModel testAlbumModel = new AlbumModel("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
	Assertions.assertEquals("light", testAlbumModel.getTitle());

}
@Test
void getArtistTest(){
	AlbumModel testAlbum = new AlbumModel("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
	Assertions.assertEquals("madeson",testAlbum.getArtist());

}
	@Test
	void getSongCountTest(){
		AlbumModel testAlbumModel = new AlbumModel("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
		Assertions.assertEquals(19, testAlbumModel.getSong_count());

	}
	@Test
	void getLengthTest(){
		AlbumModel testAlbumModel = new AlbumModel("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
		Assertions.assertEquals("5:18", testAlbumModel.getLength());
	}
	@Test
	void getImageUrlTest(){
		AlbumModel testAlbumModel = new AlbumModel("light","madeson",19,"5:18","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.RMdFUfNe1i78pwWbJg81KAHaHa%26pid%3DApi&f=1");
		Assertions.assertNotNull(testAlbumModel.getImage_url());
	}

}
