/*
 * Copyright (c) 2010 Jan Berkel <jan.berkel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zegoggles.smssync;

import android.content.Context;
import android.accounts.Account;
import android.accounts.AccountManager;

public class ContactAccessorPost20 implements ContactAccessor {
  public String getOwnerEmail(Context context) {
      AccountManager mgr = AccountManager.get(context);
      for (Account acc : mgr.getAccountsByType("com.google")) {
        return acc.name;
      }
      return null;
  }
}
