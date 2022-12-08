package com.felstar.openai.moderation

/**
 * @param flagged 
 * @param categories 
 * @param category_scores 
 */
case class CreateModerationResponseResults (
  flagged: Boolean,
  categories: CreateModerationResponseCategories,
  category_scores: CreateModerationResponseCategoryScores
)

