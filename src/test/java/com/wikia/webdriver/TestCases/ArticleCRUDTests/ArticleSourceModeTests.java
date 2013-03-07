package com.wikia.webdriver.TestCases.ArticleCRUDTests;

import org.testng.annotations.Test;

import com.wikia.webdriver.Common.ContentPatterns.PageContent;
import com.wikia.webdriver.Common.ContentPatterns.VideoContent;
import com.wikia.webdriver.Common.Core.CommonFunctions;
import com.wikia.webdriver.Common.Core.Global;
import com.wikia.webdriver.Common.Properties.Properties;
import com.wikia.webdriver.Common.Templates.TestTemplate;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Gallery.GalleryAddPhotoComponentObject;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Gallery.GalleryBuilderComponentObject;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Gallery.GalleryBuilderComponentObject.Orientation;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Photo.PhotoAddComponentObject;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Photo.PhotoOptionsComponentObject;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Vet.VetAddVideoComponentObject;
import com.wikia.webdriver.PageObjectsFactory.ComponentObject.Vet.VetOptionsComponentObject;
import com.wikia.webdriver.PageObjectsFactory.PageObject.WikiPage.EditMode.WikiArticleEditMode;
import com.wikia.webdriver.PageObjectsFactory.PageObject.WikiPage.EditMode.WikiArticleSourceEditMode;

public class ArticleSourceModeTests extends TestTemplate{
	
	String pageName;
	
	
	@Test(groups={"RTE_extended","RTE_extended_001"})
	public void RTE_001_Bold(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickBold();
		source.checkSourceContent("'''Bold text'''");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_002"})
	public void RTE_002_Italic(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickItalic();
		source.checkSourceContent("''Italic text''");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_003"})
	public void RTE_003_InternalLink(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickInternalLink();
		source.checkSourceContent("[[Link title]]");
		source.clickOnPublishButton();
	}

	@Test(groups={"RTE_extended","RTE_extended_004"})
	public void RTE_004_ExternalLink(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickExternalLink();
		source.checkSourceContent("[http://www.example.com link title]");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_005"})
	public void RTE_005_HeadLine(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickLvl2Headline();
		source.checkSourceContent("\n== Headline text ==\n");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_006"})
	public void RTE_006_EmbedFile(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickEmbedFile();
		source.checkSourceContent("[[File:Example.jpg]]");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_007"})
	public void RTE_007_EmbedMedia(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickEmbedMedia();
		source.checkSourceContent("[[Media:Example.ogg]]");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_008"})
	public void RTE_008_Math(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickMath();
		source.checkSourceContent("<math>Insert formula here</math>");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_009"})
	public void RTE_009_Nowiki(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickNowiki();
		source.checkSourceContent("<nowiki>Insert non-formatted text here</nowiki>");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_010"})
	public void RTE_010_Signature(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickSignature();
		source.checkSourceContent("--~~~~");
		source.clickOnPublishButton();
	}	
	
	@Test(groups={"RTE_extended","RTE_extended_011"})
	public void RTE_011_HLine(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickHorizontalLine();
		source.checkSourceContent("\n----\n");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_012"})
	public void RTE_012_Photo(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		PhotoAddComponentObject photoAddPhoto = source.clickAddPhoto();
		PhotoOptionsComponentObject photoOptions = photoAddPhoto.addPhotoFromWiki("image", 1);
		photoOptions.setCaption(PageContent.caption);
		photoOptions.clickAddPhoto();
		source.checkSourceContent(String.format(PageContent.wikiTextPhoto, PageContent.caption));
		source.clickOnPublishButton();
	}	
	
	@Test(groups={"RTE_extended","RTE_extended_013"})
	public void RTE_013_Slideshow(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickAddGallery();
		source.verifyComponentSelector();
		source.addComponent("slideshow");
		source.waitForObjectModalAndClickAddAphoto("GallerySlideshow");
		source.searchImageInLightBox("image");
		source.galleryCheckImageInputs(4);
		source.galleryClickOnSelectButton();
		source.gallerySetPositionSlideshow("Center");
		source.galleryClickOnFinishButton();
		source.checkSourceContent("<gallery type=\"slideshow\" position=\"center\">\nImage010.jpg\nImage009.jpg\nImage008.jpg\nImage007.jpg\n</gallery>");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_014"})
	public void RTE_014_Gallery(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickAddGallery();
		source.verifyComponentSelector();
		GalleryBuilderComponentObject galleryBuiler = (GalleryBuilderComponentObject) source.addComponent("gallery");
		GalleryAddPhotoComponentObject galleryAddPhoto = galleryBuiler.clickAddPhoto();
		galleryAddPhoto.search("image");
		galleryAddPhoto.choosePhotos(4);
		galleryBuiler = galleryAddPhoto.clickSelect();
		galleryBuiler.adjustPosition("Center");
		galleryBuiler.adjustColumns("2");
		galleryBuiler.adjustSpacing("Small");
		galleryBuiler.adjustOrientation(Orientation.landscape);
		galleryBuiler.clickFinish();
		source.checkSourceContent("<gallery position=\"center\" columns=\"2\" spacing=\"small\">\nImage010.jpg\nImage009.jpg\nImage008.jpg\nImage007.jpg\n</gallery>");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_015"})
	public void RTE_015_Slider(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		source.clickAddGallery();
		source.verifyComponentSelector();
		source.addComponent("slider");
		source.waitForObjectModalAndClickAddAphoto("GallerySlider");
		source.searchImageInLightBox("image");
		source.galleryCheckImageInputs(4);
		source.galleryClickOnSelectButton();
		source.gallerySetSliderPosition(2);
		source.galleryClickOnFinishButton();
		source.checkSourceContent("<gallery type=\"slider\" orientation=\"right\">\nImage010.jpg\nImage009.jpg\nImage008.jpg\nImage007.jpg\n</gallery>");
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_016"})
	public void RTE_016_Video(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.clearSource();
		VetAddVideoComponentObject vetAddingVideo = source.clickAddVideo();
		VetOptionsComponentObject vetOptions = vetAddingVideo.addVideoByUrl(VideoContent.youtubeVideoURL);
		vetOptions.setCaption(PageContent.caption);
		vetOptions.submit();
		source.checkSourceVideoContent("[["+VideoContent.youtubeVideoWikiText+PageContent.caption+"]]");
		source.clickOnPublishButton();		
	}
	
	
	@Test(groups={"RTE_extended","RTE_extended_017"})
	public void RTE_017_MoreMainTools(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.checkMainTools();
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_018"})
	public void RTE_018_MoreWikiMarkupTools(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.checkWikiMarkupTools();
		source.clickOnPublishButton();
	}
	
	@Test(groups={"RTE_extended","RTE_extended_019"})
	public void RTE_019_MoreSympolsTools(){
		WikiArticleSourceEditMode source = new WikiArticleSourceEditMode(driver, Global.DOMAIN);
		pageName = PageContent.articleNamePrefix+source.getTimeStamp();
		source.openWikiPage();
		CommonFunctions.logInCookie(Properties.userNameStaff, Properties.passwordStaff);
		source.createNewArticleSource(pageName, 1);
		source.checkSymbolsTools();
		source.clickOnPublishButton();
	}
}
