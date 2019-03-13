/**
 * Copyright (C) 2019 Philip Helger
 * http://www.helger.com
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.registry434.app.bt;

import javax.annotation.Nullable;

public final class BusinessTerm extends AbstractBT
{
  private final String m_sDataType;

  public BusinessTerm (@Nullable final BusinessGroup aParent,
                       final String sID,
                       final String sName,
                       final String sCard,
                       final String sDataType)
  {
    super (aParent, sID, sName, sCard);
    m_sDataType = sDataType;
  }

  public String getDataType ()
  {
    return m_sDataType;
  }
}