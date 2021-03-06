package com.commons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.commons.entity.SpellChecker;
import com.commons.entity.TextEditor;

@Configuration
public class TextEditorConfig {
   @Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean 
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}