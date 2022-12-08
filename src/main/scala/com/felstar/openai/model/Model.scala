package com.felstar.openai.model

/**
 * = Model =
 *
 * @param id 
 * @param `object` 
 * @param created 
 * @param owned_by 
 */
case class Model (
  id: String,
  `object`: String,
  created: Long,
  owned_by: String,
  permission: List[Permission]
)

