# CommonAndroidUtils
A simple android library in which common android utils functions like show toast, Intent, check network etc..


# Usage

# 1).How to show Toast
 CommonUtils.showLongToast(this,"Hello");
 
# 2). Check network status
 CommonUtils.checkIsNetworkAvailable(this);
 
# 3). Check Language
CommonUtils.checkLanguage(this,"en");

# 4). Hide Keyboard
CommonUtils.hideKeyboard(context,view);

# 5). Start Activity Intent
CommonUtils.genericIntent(context,className,bundle,isFinished);

# Download


	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  	dependencies {
	        implementation 'com.github.DanishAmjad12:CommonAndroidUtils:1.0.1'
	}

# Licence

Copyright 2018 Danish Amjad

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
