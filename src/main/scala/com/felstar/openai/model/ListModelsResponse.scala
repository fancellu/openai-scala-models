package com.felstar.openai.model

/**
 * @param `object` 
 * @param data 
 */
case class ListModelsResponse (
  `object`: String,
  data: List[Model]
)

