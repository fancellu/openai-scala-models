package com.felstar.openai.moderation

/**
 * @param hate 
 * @param hatethreatening 
 * @param self_harm 
 * @param sexual 
 * @param sexualminors 
 * @param violence 
 * @param violencegraphic 
 */
case class CreateModerationResponseCategories (
  hate: Boolean,
  `hate/threatening`: Boolean,
  self_harm: Boolean,
  sexual: Boolean,
  `sexual/minors`: Boolean,
  violence: Boolean,
  `violence/graphic`: Boolean
)

