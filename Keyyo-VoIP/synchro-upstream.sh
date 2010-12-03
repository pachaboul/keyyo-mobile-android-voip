find ./src/com/ -name "*.java" -type f -exec sed -i 's/^import com\.keyyomobile\.android\.voip\.R;$/import com.csipsimple.R;/' {} \;

meld ./ ../CSipSimple

find ./src/com/ -name "*.java" -type f -exec sed -i 's/^import com\.csipsimple\.R;$/import com.keyyomobile.android.voip.R;/' {} \;

