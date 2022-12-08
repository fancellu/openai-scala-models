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
case class CreateModerationResponseCategoryScores (
  hate: BigDecimal,
  hatethreatening: BigDecimal,
  self_harm: BigDecimal,
  sexual: BigDecimal,
  sexualminors: BigDecimal,
  violence: BigDecimal,
  violencegraphic: BigDecimal
)

