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
  hatethreatening: Boolean,
  self_harm: Boolean,
  sexual: Boolean,
  sexualminors: Boolean,
  violence: Boolean,
  violencegraphic: Boolean
)

