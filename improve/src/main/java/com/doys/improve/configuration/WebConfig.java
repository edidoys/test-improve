//package com.doys.improve.configuration;
//
//import com.fasterxml.jackson.databind.SerializationFeature;
//import java.util.List;
//import java.util.Optional;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@ComponentScan({"com.doys.improve.controller" })
//@EnableAspectJAutoProxy
//public class WebConfig  implements WebMvcConfigurer {
//
//
//  public WebConfig() {
//    super();
//  }
//
//  @Override
//  public void extendMessageConverters(final List<HttpMessageConverter<?>> converters) {
//    final Optional<HttpMessageConverter<?>> jsonConverterFound = converters.stream().filter(c -> c instanceof MappingJackson2HttpMessageConverter).findFirst();
//    if (jsonConverterFound.isPresent()) {
//      final AbstractJackson2HttpMessageConverter converter = (AbstractJackson2HttpMessageConverter) jsonConverterFound.get();
//      converter.getObjectMapper().disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//    }
//
//    final Optional<HttpMessageConverter<?>> xmlConverterFound = converters.stream().filter(c -> c instanceof MappingJackson2XmlHttpMessageConverter).findFirst();
//    if (xmlConverterFound.isPresent()) {
//      final MappingJackson2XmlHttpMessageConverter converter = (MappingJackson2XmlHttpMessageConverter) xmlConverterFound.get();
//      converter.getObjectMapper().enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//    }
//  }
//
//  // beans
//
//}